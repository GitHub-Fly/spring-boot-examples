package io.ymq.mybatis.dao;

import io.ymq.mybatis.dao.base.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

// 数据源 two
@Repository
public class YmqTwoBaseDao extends BaseDao {

    @Resource
    public void setSqlSessionFactorYmqTwo(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

}
