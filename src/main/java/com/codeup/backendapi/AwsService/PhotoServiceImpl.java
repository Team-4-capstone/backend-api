//package com.codeup.backendapi.AwsService;
//
//import com.codeup.backendapi.config.BucketName;
//import com.codeup.backendapi.data.*;
//import com.codeup.backendapi.domain.Photo;
//import com.codeup.backendapi.dto.CreateReportDto;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.*;
//
//import static org.apache.http.entity.ContentType.*;
//
//@Service
//public class PhotoServiceImpl implements PhotoService {
//    private final FileStore fileStore;
//    private final TodoRepository repository;
//
//    private final ReportRepository reportRepository;
//    private final LocationRepository locationRepository;
//    private final DescriptionRepository descriptionRepository;
//    private final CategoryRepository categoryRepository;
//    private final StatusRepository statusRepository;
//
//
//    public PhotoServiceImpl(FileStore fileStore, TodoRepository repository, ReportRepository reportRepository, LocationRepository locationRepository, DescriptionRepository descriptionRepository, CategoryRepository categoryRepository, StatusRepository statusRepository) {
//        this.fileStore = fileStore;
//        this.repository = repository;
//        this.reportRepository = reportRepository;
//        this.locationRepository = locationRepository;
//        this.descriptionRepository = descriptionRepository;
//        this.categoryRepository = categoryRepository;
//        this.statusRepository = statusRepository;
//    }
//
//    @Override
//    public Photo saveTodo(MultipartFile file,
//                          CreateReportDto dto,
//                          Report newReport, Location location,
//                          Description descriptionObj, Category category,
//                          Status status) {
//        //Check if the file is an image
//        if (!Arrays.asList(IMAGE_PNG.getMimeType(),
//                IMAGE_BMP.getMimeType(),
//                IMAGE_GIF.getMimeType(),
//                IMAGE_JPEG.getMimeType()).contains(file.getContentType())) {
//            throw new IllegalStateException("FIle uploaded is not an image");
//        }
//        //get file metadata
//        Map<String, String> metadata = new HashMap<>();
//        metadata.put("Content-Type", file.getContentType());
//        metadata.put("Content-Length", String.valueOf(file.getSize()));
//        //Save Image in S3 and then save Todo in the database
//        String path = String.format("%s/%s", BucketName.TODO_IMAGE.getBucketName(), UUID.randomUUID());
//        String fileName = String.format("%s", file.getOriginalFilename());
//        try {
//            fileStore.upload(path, fileName, Optional.of(metadata), file.getInputStream());
//        } catch (IOException e) {
//            throw new IllegalStateException("Failed to upload file", e);
//        }
//        Photo todo = new Photo(path, fileName
//        );
//        System.out.println(todo);
//
//        newReport.setPhoto(todo);
//        repository.save(todo);
//        newReport.setStatus(status);
//        category.setCategory(dto.getCategory());
//        newReport.setCategory(category);
//        newReport.setStatus(newReport.getStatus());
//        newReport.setMoreDetails(dto.getMoreDetails());
//        location.setLatitude(dto.getLat());
//        location.setLongitude(dto.getLon());
//        newReport.setLocation(location);
//        descriptionObj.setColor(dto.getColor());
//        descriptionObj.setQuantity(dto.getQuantity());
//        descriptionObj.setSecondaryColor(dto.getSecondaryColor());
//        descriptionObj.setSize(dto.getSize());
//        newReport.setDescription(descriptionObj);
//        statusRepository.save(status);
//        categoryRepository.save(category);
//        descriptionRepository.save(descriptionObj);
//        locationRepository.save(location);
//        reportRepository.save(newReport);
//
//        return null;
//
//    }
//
//    @Override
//    public byte[] downloadTodoImage(Long id) {
//        Photo todo = repository.findById(id).get();
//        return fileStore.download(todo.getImagePath(), todo.getImageFileName());
//    }
//
//    @Override
//    public List<Photo> getAllTodos() {
//        List<Photo> todos = new ArrayList<>();
//        repository.findAll().forEach(todos::add);
//        return todos;
//    }
//
//    @Override
//    public Photo getByPathFile() {
//        return null;
//    }
//
//
//}