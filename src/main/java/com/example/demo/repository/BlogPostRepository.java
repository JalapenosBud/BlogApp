package com.example.demo.repository;

import com.example.demo.interfaces.BlogPostRepositoryInterface;
import com.example.demo.model.BlogPost;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.sql.*;
import java.util.List;

@Repository
public class BlogPostRepository implements BlogPostRepositoryInterface
{
    Connection connection = null;
    Statement stmt = null;
    @Override
    public void saveBlogPostToDB(BlogPost model)
    {
        String jdbcdriver = "com.mysql.jdbc.Driver";
        String db_url = "jdbc:mysql://localhost";
    
        try
        {
            connection = DriverManager.getConnection(db_url,"groot","");
            stmt = connection.createStatement();
    
            String title = model.getTitle();
            String author = model.getUser_name_author();
            String blogPostText = model.getBlog_post_text();
    
            String sqlCreatePost =
                    "INSERT INTO blogposts" +
                            "values(title,author,creation_date)" +
                            "('" + title +
                            "', '" + author +
                            "', '" + blogPostText + "', ')";
            
            stmt.executeUpdate(sqlCreatePost);
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try{
                if(stmt != null)
                    stmt.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            if(connection!=null)
            {
                try
                {
                    connection.close();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
    
        
    }
    
    @Override
    public List<BlogPost> getAllBlogPosts()
    {
        return null;
    }
}
