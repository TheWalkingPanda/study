package com.isuperx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Connection connb = getConnection("jdbc:mysql://120.27.236.207:18070/dwd_shardb", "cobarb_query", "cobarb_query_151416!@#");
        Connection connc = getConnection("jdbc:mysql://120.27.236.207:18072/dwd_shardc", "cobarc_query", "cobarc_query_151416!@#");

        PreparedStatement pstB = connb.prepareStatement("SELECT id from rider");
        PreparedStatement pstC = connc.prepareStatement("SELECT id from rider");

        ResultSet retB = pstB.executeQuery();
        ResultSet retC = pstC.executeQuery();

        List<Long> riderIdListB = new ArrayList<Long>();
        while (retB.next()) {
            long riderId = retB.getLong(1);
            riderIdListB.add(riderId);
        }

        List<Long> riderIdListC = new ArrayList<Long>();
        while (retC.next()) {
            long riderId = retC.getLong(1);
            riderIdListC.add(riderId);
        }

        riderIdListB.removeAll(riderIdListC);

        System.out.println(riderIdListB);
    }

    public static Connection getConnection (String url, String user, String password) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
}
