
package repository;

import model.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by khush on 6/18/2018.
 */


@Repository
public interface UserInfoRepository extends MongoRepository<UserInfo, String>{

}

