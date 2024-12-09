package picto.com.photomanager.domain.photo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetRepresentativePhotoRequest {
    // random OR top
    String eventType;
    // large OR middle OR small
    String locationType;
    // 지역명
    String locationName;
    // 전송자 식별키
    Long senderId;
    // 조회할 사진 개수
    int count;

    @Override
    public String toString() {
        return "GetRepresentativePhotoRequest [eventType=" + eventType + ", locationType=" + locationType + ", locationName=" + locationName + ", senderId=" + senderId + ", count=" + count + "]";
    }
}
