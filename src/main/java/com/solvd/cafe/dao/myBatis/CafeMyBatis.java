package com.solvd.cafe.dao.myBatis;

import com.solvd.cafe.dao.ICafeDao;
import com.solvd.cafe.models.CafeModel;
import com.solvd.cafe.myBatis.MyBatisSQLFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CafeMyBatis {
    private static final Logger LOGGER = LogManager.getLogger(CafeMyBatis.class);

    public static void main(String[] args) {
        LOGGER.debug("This is trace form Roma");
        LOGGER.info("This is info form Roma");

//        MyBatisSQLFactory factory = MyBatisSQLFactory.newInstance("myBatisConfig/mybatis_config.xml");
//        SqlSessionFactory sessionFactory = factory.getFactory();
//        SqlSession session = sessionFactory.openSession();
//        ICafeDao cafeMapper = session.getMapper(ICafeDao.class);
//        List<CafeModel> cafeModel = cafeMapper.getCafeById(4);
//        session.close();
//        LOGGER.info(cafeModel);

        // Delete entity:
//        MyBatisSQLFactory factory = MyBatisSQLFactory.newInstance("myBatisConfig/mybatis_config.xml");
//        SqlSessionFactory sessionFactory = factory.getFactory();
//        SqlSession session = sessionFactory.openSession();
//        ICafeDao cafeMapper = session.getMapper(ICafeDao.class);
//        cafeMapper.deleteCafeById(4);
//        session.commit();
//        LOGGER.info("Remove element successfully");
//        session.close();

       //  Create entity:
//        MyBatisSQLFactory factory = MyBatisSQLFactory.newInstance("myBatisConfig/mybatis_config.xml");
//        SqlSessionFactory sessionFactory = factory.getFactory();
//        SqlSession session = sessionFactory.openSession();
//        ICafeDao cafeMapper = session.getMapper(ICafeDao.class);
//        CafeModel cafeModelSave = new CafeModel(4, "Romans","rrdwqq","rrdwqq","rrdwqq");
//        cafeMapper.createCafe(cafeModelSave);
//        session.commit();
//        LOGGER.info(cafeModelSave.toString());

//// Update entity:
//        MyBatisSQLFactory factory = MyBatisSQLFactory.newInstance("myBatisConfig/mybatis_config.xml");
//        SqlSessionFactory sessionFactory = factory.getFactory();
//        SqlSession session = sessionFactory.openSession();
//        ICafeDao cafeMapper = session.getMapper(ICafeDao.class);
//        List<CafeModel> cafeModelUpdate = cafeMapper.getCafeById(4);
//        cafeModelUpdate.get(0).setName("MamaMiya");
//        cafeMapper.updateCafeMyBatis(cafeModelUpdate.get(0));
//            session.commit();
//        LOGGER.info(cafeModelUpdate.get(0).toString());

    }

}
