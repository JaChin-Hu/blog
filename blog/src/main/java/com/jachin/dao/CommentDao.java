package com.jachin.dao;

import com.jachin.pojo.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Long>, JpaSpecificationExecutor<Comment> {
    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
