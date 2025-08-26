package com.blog.service;

import com.blog.dto.BlogDTO;
import com.blog.dto.BlogResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BlogService {


    BlogResponse createBlog(BlogDTO blogDTO);
    

    BlogResponse getBlogById(Long id);
    

    BlogResponse updateBlog(Long id, BlogDTO blogDTO);
    

    void deleteBlog(Long id);
    

    Page<BlogResponse> getAllBlogs(Pageable pageable);
    

    Page<BlogResponse> searchBlogsByTitle(String title, Pageable pageable);
    

    Page<BlogResponse> searchBlogsByContent(String content, Pageable pageable);
    

    Page<BlogResponse> searchBlogs(String query, Pageable pageable);
}
