package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Artist does not exist!")
public class ArtistNotFoundException extends Exception {

}
