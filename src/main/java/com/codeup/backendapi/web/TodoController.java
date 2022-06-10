package com.codeup.backendapi.web;

import com.codeup.backendapi.AwsService.PhotoService;
import com.codeup.backendapi.data.*;
import com.codeup.backendapi.domain.Photo;
import com.codeup.backendapi.dto.CreateReportDto;
import com.codeup.backendapi.service.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/todo")
public class TodoController {
    private final PhotoService service;

    private final ReportService reportService;

    public TodoController(PhotoService service, ReportService reportService) {
        this.service = service;
        this.reportService = reportService;
    }

    @GetMapping
    public List<Photo> getTodos() {
        return service.getAllTodos();
    }

    @PostMapping(
            path = "",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Photo> saveTodo(
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("file") MultipartFile file,
            @RequestParam("moreDetails") String moreDetails,
            @RequestParam("latitude") String latitude,
            @RequestParam("longitude") String longitude,
            @RequestParam("category") String category,
            @RequestParam("size") String size,
            @RequestParam("color") String color,
            @RequestParam("quantity") int quantity,
            @RequestParam("secondaryColor") String secondaryColor) {
        CreateReportDto dto = new CreateReportDto(category, latitude, longitude,
                moreDetails, size, "", color, quantity, secondaryColor);
        Report report = new Report();
        Location location = new Location();
        Description descriptiondto = new Description();
        Category categorydto = new Category();
        Status status = new Status();
//
        return new ResponseEntity<>(service.saveTodo(title, description, file, dto, report, location,
                descriptiondto, categorydto, status), HttpStatus.OK);
    }


    @GetMapping(value = "{id}/image/download")
    public byte[] downloadTodoImage(@PathVariable("id") Long id) {
        return service.downloadTodoImage(id);
    }
}