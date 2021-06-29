package com.example.demo2;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AvatarServlet", value = "/AvatarServlet")
public class AvatarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Avatar avatar = TriangleAvatar.newAvatarBuilder().build();

        byte[] bytes =  avatar.createAsPngBytes(123456L);

        response.getOutputStream().write(bytes);
    }
}
