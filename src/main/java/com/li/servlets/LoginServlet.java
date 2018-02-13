package com.li.servlets;

import dao.GiftDao;
import model.Gift;
import mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by tanke on 2018/2/12.
 */
/*
*作者：李潮
*时间：2018/2/12
*类名：LoginServlet
*/
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = (String) req.getAttribute("name");
        List<Gift> giftList = getGiftById();
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang='en'>");
        writer.println("<head>");
        writer.println("<meta charset='UTF-8'>");
        writer.println("<title>Title</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>name" + name + "</h1>");
        writer.println(" <table border='1' >");
        writer.println(" <tr>");
        writer.println(" <th>;gId</th>");
        writer.println(" <th>;礼物名称</th>");
        writer.println(" <th >;礼物图标</th>");
        writer.println(" <th >;礼物大图</th>");
        writer.println(" <th >;展示类型</th>");
        writer.println(" <th >;状态</th>");
        writer.println(" <th >;权重</th>");
        writer.println(" <th>;现价（币）</th>");
        writer.println(" <th>;原价（币）</th>");
        writer.println(" <th>;人民币价值</th>");
        writer.println(" <th>;内容</th>");
        writer.println(" <th>;赠送礼物间隔（秒）</th>");
        writer.println(" <th>;操作人Id</th>");
        writer.println(" <th>;创建时间</th>");
        writer.println(" </tr>");
        for (int i = 0; i < giftList.size(); i++) {

            if (i % 2 == 0) {
                writer.println("<tr bgcolor=\"#fff0f5\">");
            } else {
                writer.println("<tr bgcolor=\"#00ced1\">");
            }
            writer.println("<td>" + giftList.get(i).getgId() + "</td>");
            writer.println("<td>" + giftList.get(i).getGiftName() + "</td>");
            writer.println("<td><img src=\"" + giftList.get(i).getIcon() + "\"></td>");
            writer.println("<td><img src=\"" + giftList.get(i).getCover() + "\"></td>");
            writer.println("<td>" + giftList.get(i).getShowType() + "</td>");
            writer.println("<td>" + giftList.get(i).getStatus() + "</td>");
            writer.println("<td>" + giftList.get(i).getWeight() + "</td>");
            writer.println("<td>" + giftList.get(i).getPresCoin() + "</td>");
            writer.println("<td>" + giftList.get(i).getOrigCoin() + "</td>");
            writer.println("<td>" + giftList.get(i).getAmount() + "</td>");
            writer.println("<td>" + giftList.get(i).getContent() + "</td>");
            writer.println("<td>" + giftList.get(i).getInterval() + "</td>");
            writer.println("<td>" + giftList.get(i).getAdminUserId() + "</td>");
            writer.println("<td>" + giftList.get(i).getCreateTime() + "</td>");
            writer.println("</tr>");
        }
        writer.println(" </table>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }


    public List<Gift> getGiftById() {
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory("config/mybatis-config.xml");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Gift> list = null;
        try {
            GiftDao mapper = (GiftDao) sqlSession.getMapper(GiftDao.class);
            list = mapper.getAllGift();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return list;
    }
}
