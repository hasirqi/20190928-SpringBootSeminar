package com.mit.artist.web;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ArtistForm {

    @NonNull
    @Size(min =1 , max = 200)
    private String name;

    @NonNull
    private String gender;

    @NonNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

}
