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
        String db_url = "jdbc:mysql://localhost/blogapp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    
        try
        {
            connection = DriverManager.getConnection(db_url,"groot","iamgroot");
            stmt = connection.createStatement();
    
            String title = model.getTitle();
            String author = model.getUser_name_author();
            String blogPostText = model.getBlog_post_text();
    
            String sqlCreatePost =
                    "INSERT INTO blogposts(title,author,blog_post_text)" +
                            "value" +
                            "('" + title +
                            "', '" + author +
                            "', '" + blogPostText + "')";
            
            stmt.executeUpdate(sqlCreatePost);
            System.out.println("posted blogpost: '" + title + "' to db");
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

    @Override
    public BlogPost searchForBlogPost(String searchTerm) {
        return null;
    }
}
