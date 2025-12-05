package com.sist.web.service;

import java.util.*;
import com.sist.web.mapper.*;
import com.sist.web.vo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService {
	@Autowired
	private MusicMapper mapper;

	@Override
	public List<MusicVO> musicListData(Map map) {
		return mapper.musicListData(map);
	}

	@Override
	public int musicTotalPage() {
		return mapper.musicTotalPage();
	}
	
}
