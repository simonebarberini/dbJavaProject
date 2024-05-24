package com.test.dbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.test.model.Prodotto;

public class ProdottoDAO {
    public void createProdotto(Prodotto prodotto){
        System.out.println("CE SO ARRIVATO");
        String sql = "INSERT INTO product (user_id, name, description, price, stock) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, prodotto.getUser_id());
            pstmt.setString(2, prodotto.getName());
            pstmt.setString(3, prodotto.getDescription());
            pstmt.setDouble(4, prodotto.getPrice());
            pstmt.setInt(5, prodotto.getStock());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Prodotto getProduct(int productId) throws SQLException {
        String sql = "SELECT * FROM product WHERE product_id = ?";
        Prodotto product = new Prodotto(0, 0, "", "", 0, 0);
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, productId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                product.setProduct_id(rs.getInt("product_id"));
                product.setUser_id(rs.getInt("user_id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setStock(rs.getInt("stock"));
                return product;
            }
        }
        return null;
    }

}
