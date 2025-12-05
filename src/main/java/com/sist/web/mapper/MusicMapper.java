package com.sist.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.sist.web.vo.*;

@Mapper
@Repository //dao 기능 포함
public interface MusicMapper {
	public List<MusicVO> musicListData(Map map);  // 앞 resulttype 뒤 parameterType
	public int musicTotalPage();
	
}
