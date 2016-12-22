package cn.chinamobile.iot.publicity.mapper.shard;

import org.springframework.stereotype.Repository;

import cn.chinamobile.iot.publicity.beans.ShardTestBean;


@Repository
public interface AppTestMapper {
	public void insert(ShardTestBean shardTestBean);
}
