package de.andrena.junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@ExcludeCategory(Slow.class)
public class AllFastTests extends AllTests {}