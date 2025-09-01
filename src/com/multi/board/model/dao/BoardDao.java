package com.multi.board.model.dao;

import com.multi.board.model.bean.BoardDto;

import java.util.List;

//DB에 접근읋해서 아래의 기능들으 수행
public interface BoardDao {//Data Access Onbject
    void registerArticle(BoardDto boardDto);
    List<BoardDto> searchListAll();
    List<BoardDto> searchListBySubject(String subject);
    BoardDto viewArticle(int no);
    void modifyArticle(BoardDto boardDto);
    void deleteArticle(int no);
}