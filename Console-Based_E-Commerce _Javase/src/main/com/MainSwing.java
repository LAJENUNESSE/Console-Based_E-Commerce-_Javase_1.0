package main.com;

import main.com.model.Good;
import main.com.service.AdminService;
import main.com.service.GoodService;
import main.com.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSwing {
    private static UserService userService = new UserService();
    private static AdminService adminService = new AdminService();
    private static GoodService goodService = new GoodService();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("电子商城系统");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new GridLayout(6, 1));

            JButton registerButton = new JButton("注册");
            JButton loginButton = new JButton("登录");
            JButton adminLoginButton = new JButton("管理员登录");
            JButton forgotPasswordButton = new JButton("找回密码");
            JButton exitButton = new JButton("退出");

            frame.add(registerButton);
            frame.add(loginButton);
            frame.add(adminLoginButton);
            frame.add(forgotPasswordButton);
            frame.add(exitButton);

            frame.setVisible(true);

            registerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    userService.register();
                }
            });

            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (userService.login()) {
                        userMenu();
                    } else {
                        JOptionPane.showMessageDialog(frame, "登录失败，用户名或密码错误。");
                    }
                }
            });

            adminLoginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (adminService.login()) {
                        adminMenu();
                    } else {
                        JOptionPane.showMessageDialog(frame, "管理员登录失败，用户名或密码错误。");
                    }
                }
            });

            forgotPasswordButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    userService.forgotPassword();
                }
            });

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        });
    }

    private static void userMenu() {
        // 实现用户菜单逻辑，使用类似的Swing组件
    }

    private static void adminMenu() {
        // 实现管理员菜单逻辑，使用类似的Swing组件
    }
}
