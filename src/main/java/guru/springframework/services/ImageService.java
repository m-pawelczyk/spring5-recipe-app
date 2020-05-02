package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 02.05.2020
 * created ImageService in guru.springframework.services
 * in project spring5-recipe-app
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
