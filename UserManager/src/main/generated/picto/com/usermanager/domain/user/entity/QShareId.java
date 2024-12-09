package picto.com.usermanager.domain.user.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QShareId is a Querydsl query type for ShareId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QShareId extends BeanPath<ShareId> {

    private static final long serialVersionUID = 329766794L;

    public static final QShareId shareId = new QShareId("shareId");

    public final NumberPath<Long> folderId = createNumber("folderId", Long.class);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QShareId(String variable) {
        super(ShareId.class, forVariable(variable));
    }

    public QShareId(Path<? extends ShareId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShareId(PathMetadata metadata) {
        super(ShareId.class, metadata);
    }

}

