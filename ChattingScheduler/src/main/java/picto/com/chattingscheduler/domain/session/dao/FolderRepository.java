package picto.com.chattingscheduler.domain.session.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import picto.com.chattingscheduler.domain.session.entity.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
