package ru.job4j.algo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTest {

    @Test
    void whenSortedThenOk1() {
        int[] array = {10, 4, 6, 4, 8, -13, 2, 3};
        assertThat(Merge.mergesort(array)).containsExactly(-13, 2, 3, 4, 4, 6, 8, 10);
    }

    @Test
    void whenEmptyArrayThenOk() {
        int[] array = {};
        assertThat(Merge.mergesort(array)).isEmpty();
    }

    @Test
    void whenSingleElementArrayThenOk() {
        int[] array = {5};
        assertThat(Merge.mergesort(array)).containsExactly(5);
    }

    @Test
    void whenAlreadySortedArrayThenOk() {
        int[] array = {-10, -5, 0, 5, 10, 15};
        assertThat(Merge.mergesort(array)).containsExactly(-10, -5, 0, 5, 10, 15);
    }

    @Test
    void whenArrayWithDuplicatesThenOk() {
        int[] array = {4, 2, 2, 8, 8, 1, 3, 3};
        assertThat(Merge.mergesort(array)).containsExactly(1, 2, 2, 3, 3, 4, 8, 8);
    }

    @Test
    void whenArrayWithNegativeNumbersThenOk() {
        int[] array = {3, -1, -7, 4, 2, -10, 0};
        assertThat(Merge.mergesort(array)).containsExactly(-10, -7, -1, 0, 2, 3, 4);
    }
}