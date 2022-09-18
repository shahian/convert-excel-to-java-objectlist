package com.shahian.convertexceltojavaobjectlist.service.intrface;

import com.shahian.convertexceltojavaobjectlist.entity.Group;

import java.io.IOException;
import java.util.List;

public interface GroupService {
    List<Group> getListfromExcelData() throws IOException;
    List<Group> getListfromExcelDataV2() throws IOException;

}
