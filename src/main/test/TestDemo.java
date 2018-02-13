import dao.GiftDao;
import model.Gift;
import mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * Created by tanke on 2018/2/12.
 */
/*
*作者：李潮
*时间：2018/2/12
*类名：Test
*/
public class TestDemo {
    @Test
    public void test() {
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory("config/mybatis-config.xml");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            GiftDao mapper = (GiftDao) sqlSession.getMapper(GiftDao.class);
            Gift gift = mapper.seletById(1);
            System.out.println(gift);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
