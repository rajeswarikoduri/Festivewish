package com.festive.DAO;
import org.hibernate.criterion.Restrictions;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.festive.model.Allcategories;
import com.festive.model.Config;
import com.festive.model.Images;



@Transactional
@Repository("festivedao")
public class FestiveDaoImpli extends AbstractDao implements FestiveDao {
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Allcategories>  getFestiveCategories() {
		
		Criteria criteria = getSession().createCriteria(Allcategories.class);
		return (List<Allcategories>) criteria.list();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Images> getimageList(Long CategoryId) {
		Criteria criteria =getSession().createCriteria(Images.class);
		criteria.add(Restrictions.eq("CategoryId", CategoryId));
		//criteria.add(Restrictions.eq("isAvailable", true));
		return (List<Images>) criteria.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Config> getimageconfig(int ConfigId){
		
		Criteria criteria =getSession().createCriteria(Config.class);
		criteria.add(Restrictions.eq("ConfigId",ConfigId ));
		return (List<Config>) criteria.list();
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Config> getcategoryconfig(int ConfigId){
		
		Criteria criteria =getSession().createCriteria(Config.class);
		criteria.add(Restrictions.eq("ConfigId",ConfigId ));
		
		return (List <Config>) criteria.list();
	}


	

	@Override
	public Images findimageById(Long imageId) {
		Criteria criteria =getSession().createCriteria(Images.class);
		criteria.add(Restrictions.eq("imageId", imageId));
		return (Images) criteria.uniqueResult();
	}

}
