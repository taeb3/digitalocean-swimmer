package com.yassirh.digitalocean.data;

public class DropletTable extends TableHelper {
	
	public static final String NAME = "name";
	public static final String IMAGE_ID = "image_id";
	public static final String SIZE_SLUG = "size_slug";
	public static final String REGION_SLUG = "region_slug";
	public static final String LOCKED = "locked";
	public static final String STATUS = "status";
	public static final String CREATED_AT = "created_at";
	
	public DropletTable(){		
		columns.put(ID, "integer primary key");
		columns.put(NAME, "text");
		columns.put(IMAGE_ID, "integer");
		columns.put(SIZE_SLUG, "string");
		columns.put(REGION_SLUG, "string");
		columns.put(LOCKED, "integer");
		columns.put(STATUS, "text");
		columns.put(CREATED_AT, "long");
		TABLE_NAME = "droplets";
	}	
	
}
