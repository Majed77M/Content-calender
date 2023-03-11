package dev.danvega.Contentcalender.Repository;

import dev.danvega.Contentcalender.model.Content;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContentCollectionRepository {
    private final List<Content> content  = new ArrayList< >();

    public ContentCollectionRepository() {
    }
}
