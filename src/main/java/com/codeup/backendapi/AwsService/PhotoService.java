package com.codeup.backendapi.AwsService;

import com.codeup.backendapi.data.*;
import com.codeup.backendapi.domain.Photo;
import com.codeup.backendapi.dto.CreateReportDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PhotoService {

    Photo saveTodo(String title, String description, MultipartFile file,
                   CreateReportDto dto,
                   Report newReport, Location location,
                   Description descriptionObj, Category category,
                   Status status);

    byte[] downloadTodoImage(Long id);

    List<Photo> getAllTodos();

    Photo getByPathFile();
}