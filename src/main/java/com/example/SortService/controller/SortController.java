package com.example.SortService.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api/half-sort")
public class SortController {
    @PostMapping
    public ResponseEntity<int[][]> sortMatrixHalf(@RequestBody int[][] matrix) {
        Arrays.sort(matrix, (a, b) -> Integer.compare(a[0], b[0]));
        return ResponseEntity.ok(matrix);
    }
}
