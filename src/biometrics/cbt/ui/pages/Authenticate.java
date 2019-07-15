/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometrics.cbt.ui.pages;

import SecuGen.FDxSDKPro.jni.JSGFPLib;
import SecuGen.FDxSDKPro.jni.SGDeviceInfoParam;
import SecuGen.FDxSDKPro.jni.SGFDxDeviceName;
import SecuGen.FDxSDKPro.jni.SGFDxErrorCode;
import SecuGen.FDxSDKPro.jni.SGFingerInfo;
import SecuGen.FDxSDKPro.jni.SGFingerPosition;
import SecuGen.FDxSDKPro.jni.SGImpressionType;
import SecuGen.FDxSDKPro.jni.SGPPPortAddr;
import biometrics.cbt.domain.DBHandler;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author JBoss
 */
public class Authenticate extends javax.swing.JDialog {

    private Webcam web;
    private WebcamPanel webPanel;
    private BufferedImage ri;
    private Image image;

    private JSGFPLib fplib = null;
    private long deviceName;
    private long devicePort;
    private long ret;
    private final byte[] regMin1 = new byte[400];
    private final byte[] regMin2 = new byte[400];
    private final SGDeviceInfoParam deviceInfo = new SGDeviceInfoParam();
    private final Connection con;
    private HashMap<String, String> userDetails;
    private JScrollPane bodyScroll;
    private JPanel currentPanel;
    public static String currentStudent;

    private final Startup startup;

    public Authenticate(java.awt.Frame parent, boolean modal, Startup startup) {
        super(parent, modal);
        initComponents();
        con = DBHandler.connect();
//        initializeDevice();
        this.startup = startup;
        Image imge = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/biometrics/cbt/ui/images/images.png"));
        imge = imge.getScaledInstance(210, 190, Image.SCALE_SMOOTH);
        jLabelImage.setIcon(new ImageIcon(imge));
        setLocationRelativeTo(null);
    }

    private boolean authenticate() {
        userDetails = new HashMap<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from student_reg");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String fingerPath = rs.getString("finger");
                File fingerFile = new File(fingerPath);
                BufferedImage bi = ImageIO.read(fingerFile);
                createTemplate1(bi);
                if (matchImage()) {
                    userDetails.put("name", rs.getString("name"));
                    userDetails.put("phone", rs.getString("phone"));
                    userDetails.put("address", rs.getString("address"));
                    userDetails.put("finger", rs.getString("finger"));
                    userDetails.put("email", rs.getString("email"));

                    ps = con.prepareStatement("select * from user_reg where phone = ?");
                    ps.setString(1, rs.getString("phone"));
                    rs = ps.executeQuery();
                    rs.next();
                    userDetails.put("username", rs.getString("username"));
                    userDetails.put("password", rs.getString("password"));
                    userDetails.put("privilege", rs.getString("privilege"));
                    return true;
                }
            }
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return false;
    }

    private void createTemplate1(BufferedImage bi) throws IOException {
        int[] quality = new int[1];
        byte[] imageBuffer1 = ((java.awt.image.DataBufferByte) bi.getRaster().getDataBuffer()).getData();
        fplib.GetImageQuality(deviceInfo.imageWidth, deviceInfo.imageHeight, imageBuffer1, quality);

        SGFingerInfo fingerInfo = new SGFingerInfo();
        fingerInfo.FingerNumber = SGFingerPosition.SG_FINGPOS_LI;
        fingerInfo.ImageQuality = quality[0];
        fingerInfo.ImpressionType = SGImpressionType.SG_IMPTYPE_LP;
        fingerInfo.ViewNumber = 1;

        long iError = fplib.CreateTemplate(fingerInfo, imageBuffer1, regMin1);

    }

    private boolean matchImage() {
        int[] matchScore = new int[1];
        boolean[] matched = new boolean[1];
        long iError;
        long secuLevel = (long) 4;
        matched[0] = false;

        iError = fplib.MatchTemplate(regMin1, regMin2, secuLevel, matched);
        if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE) {
            matchScore[0] = 0;
            iError = fplib.GetMatchingScore(regMin1, regMin2, matchScore);

            if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE) {
                return matched[0];
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jComboBoxDeviceName = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxUSBPort = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        captureButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        facePanel = new javax.swing.JPanel();
        faceImage = new javax.swing.JLabel();
        snapButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new java.awt.BorderLayout());

        loginPanel.setBackground(java.awt.Color.white);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelStatus.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(51, 0, 255));
        loginPanel.add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 441, 25));

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)), "Finger Print", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setOpaque(false);

        jComboBoxDeviceName.setForeground(new java.awt.Color(102, 0, 0));
        jComboBoxDeviceName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUTO", "FDU05", "FDU04", "FDU03", "FDU02" }));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("USB port:");

        jComboBoxUSBPort.setForeground(new java.awt.Color(102, 0, 0));
        jComboBoxUSBPort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUTO_DETECT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Device Name:");

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setOpaque(false);

        jLabelImage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jLabelImage.setOpaque(true);

        captureButton.setText("Capture");
        captureButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        captureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captureButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Initialize");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(captureButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(captureButton)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxUSBPort, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxUSBPort, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 340));

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Bi-modal Biometric System");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(113, 113, 113))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        loginPanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 514, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)), "Face", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setOpaque(false);

        facePanel.setBackground(java.awt.Color.white);
        facePanel.setLayout(new java.awt.BorderLayout());

        faceImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faceImage.setPreferredSize(new java.awt.Dimension(41, 200));
        facePanel.add(faceImage, java.awt.BorderLayout.CENTER);

        snapButton.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        snapButton.setForeground(new java.awt.Color(102, 0, 0));
        snapButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biometrics/cbt/ui/images/exit.png"))); // NOI18N
        snapButton.setText("Webcam");
        snapButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        snapButton.setContentAreaFilled(false);
        snapButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        snapButton.setFocusPainted(false);
        snapButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        snapButton.setPreferredSize(new java.awt.Dimension(115, 30));
        snapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snapButtonActionPerformed(evt);
            }
        });
        facePanel.add(snapButton, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(facePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        loginPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 240, 260));

        jPanel5.setBackground(new java.awt.Color(0, 51, 0));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setLayout(new java.awt.BorderLayout());

        loginButton.setFont(new java.awt.Font("Nyala", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel5.add(loginButton, java.awt.BorderLayout.CENTER);

        loginPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 60, 50));

        jPanel1.add(loginPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void captureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captureButtonActionPerformed
        int[] quality = new int[1];
        BufferedImage img1gray = new BufferedImage(deviceInfo.imageWidth, deviceInfo.imageHeight, BufferedImage.TYPE_BYTE_GRAY);
        byte[] imageBuffer1 = ((java.awt.image.DataBufferByte) img1gray.getRaster().getDataBuffer()).getData();
        if (fplib != null) {
            ret = fplib.GetImageEx(imageBuffer1, 5 * 1000, 0, 50);
            if (ret == SGFDxErrorCode.SGFDX_ERROR_NONE) {
                this.jLabelImage.setIcon(new ImageIcon(img1gray));
                long ret2 = fplib.GetImageQuality(deviceInfo.imageWidth, deviceInfo.imageHeight, imageBuffer1, quality);

                SGFingerInfo fingerInfo = new SGFingerInfo();
                fingerInfo.FingerNumber = SGFingerPosition.SG_FINGPOS_LI;
                fingerInfo.ImageQuality = quality[0];
                fingerInfo.ImpressionType = SGImpressionType.SG_IMPTYPE_LP;
                fingerInfo.ViewNumber = 1;
                long iError = fplib.CreateTemplate(fingerInfo, imageBuffer1, regMin2);
                this.jLabelStatus.setText("getImage() Success [" + ret + "]" + " Image Quality [" + quality[0] + "]");
                loginButton.setEnabled(true);
            } else {
                this.jLabelStatus.setText("GetImageEx() Error [" + ret + "]");
                loginButton.setEnabled(false);
            }
        } else {
            this.jLabelStatus.setText("JSGFPLib is not Initialized");
            loginButton.setEnabled(false);
        }
    }//GEN-LAST:event_captureButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        initializeDevice();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void snapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snapButtonActionPerformed
        if (!snapButton.getText().equals("Capture")) {
            try {
                web = Webcam.getDefault();
                webPanel = new WebcamPanel(web);
                webPanel.setFillArea(true);
                facePanel.add(webPanel);
                facePanel.repaint();
                webPanel.setSize(facePanel.getWidth() - 10, 200);
                snapButton.setText("Capture");
            } catch (IllegalArgumentException iae) {
                ri = null;
                JOptionPane.showMessageDialog(this, "System Webcam not accessible. Please connect a webcam", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            try {
                ri = web.getImage();
                image = ri;
                faceImage.setIcon(new ImageIcon(ri));
                facePanel.remove(webPanel);
                facePanel.add(faceImage);
                facePanel.repaint();
                web.close();
                snapButton.setText("Webcam");
            } catch (Exception t) {
                ri = null;
            }
        }
    }//GEN-LAST:event_snapButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
//        if (authenticate()) {
//            startup.startExam(userDetails);
//            dispose();
//        }
        startup.startExam(userDetails);
        dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton captureButton;
    private javax.swing.JLabel faceImage;
    private javax.swing.JPanel facePanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBoxDeviceName;
    private javax.swing.JComboBox jComboBoxUSBPort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton snapButton;
    // End of variables declaration//GEN-END:variables

    private void initializeDevice() {
        int selectedDevice = jComboBoxDeviceName.getSelectedIndex();
        switch (selectedDevice) {
            case 0: //USB
            default:
                this.deviceName = SGFDxDeviceName.SG_DEV_AUTO;
                break;
            case 1: //FDU05
                this.deviceName = SGFDxDeviceName.SG_DEV_FDU05;
                break;
            case 2: //FDU04
                this.deviceName = SGFDxDeviceName.SG_DEV_FDU04;
                break;
            case 3: //CN_FDU03
                this.deviceName = SGFDxDeviceName.SG_DEV_FDU03;
                break;
            case 4: //CN_FDU02
                this.deviceName = SGFDxDeviceName.SG_DEV_FDU02;
                break;
        }
        fplib = new JSGFPLib();
        ret = fplib.Init(this.deviceName);
        if ((fplib != null) && (ret == SGFDxErrorCode.SGFDX_ERROR_NONE)) {
            this.jLabelStatus.setText("JSGFPLib Initialization Success");
            this.devicePort = SGPPPortAddr.AUTO_DETECT;
            switch (this.jComboBoxUSBPort.getSelectedIndex()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    this.devicePort = this.jComboBoxUSBPort.getSelectedIndex() - 1;
                    break;
            }
            ret = fplib.OpenDevice(this.devicePort);
            if (ret == SGFDxErrorCode.SGFDX_ERROR_NONE) {
                this.jLabelStatus.setText("OpenDevice() Success [" + ret + "]");
                captureButton.setEnabled(true);

                ret = fplib.GetDeviceInfo(deviceInfo);

            } else {
                this.jLabelStatus.setText("OpenDevice() Error [" + ret + "]");
                captureButton.setEnabled(false);
                loginButton.setEnabled(false);
            }
        } else {
            this.jLabelStatus.setText("JSGFPLib Initialization Failed");
            captureButton.setEnabled(false);
            loginButton.setEnabled(false);
        }
    }

}
