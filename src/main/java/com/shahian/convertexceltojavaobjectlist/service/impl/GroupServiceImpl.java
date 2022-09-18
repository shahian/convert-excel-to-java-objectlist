package com.shahian.convertexceltojavaobjectlist.service.impl;

import com.poiji.bind.Poiji;
import com.shahian.convertexceltojavaobjectlist.entity.Group;
import com.shahian.convertexceltojavaobjectlist.repository.GroupRepository;
import com.shahian.convertexceltojavaobjectlist.service.intrface.GroupService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    final GroupRepository groupRepository;


    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Value("${filepath}")
    public String File_Path;

    @Override
    public List<Group> getListfromExcelData() throws IOException {
        File file=new File(File_Path);
        List<Group> groupList = Poiji.fromExcel(file, Group.class);
        return groupList;
    }

    @Override
    public List<Group> getListfromExcelDataV2() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("Group.xlsx").getFile());
        List<Group> groupList = Poiji.fromExcel(file, Group.class);
        return groupList;
    }
}
