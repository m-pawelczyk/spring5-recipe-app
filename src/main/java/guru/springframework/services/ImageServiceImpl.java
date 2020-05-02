package guru.springframework.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 02.05.2020
 * created ImageServiceImpl in guru.springframework.services
 * in project spring5-recipe-app
 */
@Slf4j
@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {

        log.debug("Received a file");
    }
}
