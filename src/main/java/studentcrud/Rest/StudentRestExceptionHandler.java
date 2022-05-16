package studentcrud.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (StudentNotFoundException exe)
    {
        StudentErrorResponse error=new StudentErrorResponse(HttpStatus.NOT_FOUND.value(),
            exe.getMessage(),System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

        @ExceptionHandler
        public ResponseEntity<StudentErrorResponse> handleException (Exception exe)
        {
            StudentErrorResponse error=new StudentErrorResponse(HttpStatus.BAD_REQUEST.value(),
                exe.getMessage(),System.currentTimeMillis());

            return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
        }

}
