package com.suptnet.website.mapper;

import com.suptnet.website.entity.FileInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface FileInfoMapper {

    @Select("SELECT * FROM uploaded")
    List<FileInfo> findAll();

    @Insert("INSERT INTO uploaded(filename, upload_time, domain_num) " +
            "VALUES(#{filename}, #{upload_time}, #{domain_num})")
    int insert(FileInfo fileInfo);

    @Delete("DELETE FROM uploaded WHERE id=#{id}")
    void delete(@Param("id") Integer id);

    //void update();
}
