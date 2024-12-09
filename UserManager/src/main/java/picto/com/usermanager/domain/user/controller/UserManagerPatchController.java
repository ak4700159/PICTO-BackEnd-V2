package picto.com.usermanager.domain.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import picto.com.usermanager.domain.user.application.UserManagerPatchService;
import picto.com.usermanager.domain.user.dto.request.*;

@RestController
@RequiredArgsConstructor
public class UserManagerPatchController {
    final UserManagerPatchService userManagerPatchService;

    // 사용자 정보 변경 사항 저장
    @PatchMapping("/user-manager/user")
    public ResponseEntity<?> modifyUser(@RequestBody USerRequest request) {
        try{
            userManagerPatchService.fetchUser(request);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("success");
    }

    // 세팅값 변경
    @PatchMapping("/user-manager/setting")
    public ResponseEntity<?> modifySetting(@RequestBody SettingRequest request) {
        try{
            userManagerPatchService.fetchUserSetting(request);
        }catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("success");
    }

    // 태그 전체 업데이트
    @PutMapping("/user-manager/tag")
    public ResponseEntity<?> modifyTag(@RequestBody TagRequest request) {
        try{
            System.out.println(request.getTagNames());
            userManagerPatchService.fetchTag(request);
        }catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("success");
    }

    // 필터 변경
    @PatchMapping("/user-manager/filter")
    public ResponseEntity<?> modifyFilter(@RequestBody FilterRequest request) {
        try{
            userManagerPatchService.fetchFilter(request);
        }catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("success");
    }

    // 즐겨찾기 추가
    @PatchMapping("/user-manager/mark")
    public ResponseEntity<?> modifyMark(@RequestBody EventRequest request) {
        try{
            userManagerPatchService.fetchMark(request);
        }catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("success");
    }

    // 차단목록 추가
    @PatchMapping("/user-manager/block")
    public ResponseEntity<?> modifyBlock(@RequestBody EventRequest request) {
        try{
            userManagerPatchService.fetchBlock(request);
        }catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("success");
    }
}
