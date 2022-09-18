package com.shahian.convertexceltojavaobjectlist.controller;

import com.shahian.convertexceltojavaobjectlist.entity.Group;
import com.shahian.convertexceltojavaobjectlist.service.intrface.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GroupController {

    @Autowired
    protected GroupService groupService;

    @GetMapping(value = "/v1/groups", name = "${service.group.getAll}")
    public List<Group> getListfromExcelData() throws IOException {
        List<Group> groups = groupService.getListfromExcelData();
        return groups;
    }

}
