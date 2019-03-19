//package com.suptnet.website.service;
//
//import com.suptnet.website.entity.FileInfo;
//import com.suptnet.website.mapper.FileInfoMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class FileInfoService {
//    @Autowired(required = false)
//    private FileInfoMapper fileInfoMapper;
//
//    public List<FileInfo> queryList(){
//        List<FileInfo> fileInfos=fileInfoMapper.findAll();
//        return fileInfos;
//    }
//
////    public FileInfo findById(long userId){
////        System.out.println("userId:"+userId);
////        return fileInfoMapper.findById(userId);
////    }
//
//    public int insert() {
//        return fileInfoMapper.insert(entity);
//    }
//
//
////    public int updateEntity() {
////        FileInfo entity=new FileInfo();
////        entity.setUserId(1);
////        entity.setNickName("郭靖");
////        return fileInfoMapper.updateEntity(entity);
////    }
//
//    public int deleteEntity() {
//        return fileInfoMapper.delete(entity);
//    }
//}
//
//}
