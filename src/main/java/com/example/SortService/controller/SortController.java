package com.example.SortService.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/api/half-sort")
public class SortController {

    int[][] halfMatrix;

    @PostMapping
    public ResponseEntity<int[][]> sortMatrixHalf(@RequestBody int[][] matrix) {
        halfMatrix = matrix.clone();
        Arrays.sort(matrix, (a, b) -> Integer.compare(a[0], b[0]));
        return ResponseEntity.ok(matrix);
    }

    @GetMapping("/get-half-matrix")
    public String printMatrix(){

        String res = "";
        for (int i = 0; i < halfMatrix.length; i++) {
            for (int j = 0; j < halfMatrix[0].length; j++) {
                res += halfMatrix[i][j] + " ";
            }
            res += "<br>";
        }
        return res;
    }
}
