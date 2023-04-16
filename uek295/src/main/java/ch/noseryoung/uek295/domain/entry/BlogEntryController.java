package ch.noseryoung.uek295.domain.entry;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogEntryController {

  private final BlogEntryService blogEntryService;

  public BlogEntryController(BlogEntryService blogEntryService) {
    this.blogEntryService = blogEntryService;
  }

  @GetMapping("/")
  public ResponseEntity<List<BlogEntry>> getAllBlogEntries() {
    List<BlogEntry> blogEntries = blogEntryService.getAllBlogEntries();
    return ResponseEntity.ok(blogEntries);
  }

  @GetMapping("/{id}")
  public ResponseEntity<BlogEntry> getBlogEntryById(@PathVariable Long id) {
    BlogEntry blogEntry = blogEntryService.getBlogEntryById(id);
    return ResponseEntity.ok(blogEntry);
  }

  @PostMapping
  public ResponseEntity<Void> addBlogEntry(@Valid @RequestBody BlogEntry blogEntry) {
    blogEntryService.addBlogEntry(blogEntry);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @PutMapping("/{id}")
  public ResponseEntity<Void> updateBlogEntry(@PathVariable Long id, @Valid @RequestBody BlogEntry updatedBlogEntry) {
    blogEntryService.updateBlogEntry(id, updatedBlogEntry);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteBlogEntry(@PathVariable Long id) {
    blogEntryService.deleteBlogEntry(id);
    return ResponseEntity.ok().build();
  }
}