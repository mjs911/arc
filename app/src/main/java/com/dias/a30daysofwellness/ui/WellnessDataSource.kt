package com.dias.a30daysofwellness.ui

import com.dias.a30daysofwellness.R
import com.dias.a30daysofwellness.ui.model.Wellness

object WellnessDataSource {
    val wellnesses = listOf(
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.ai,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bi,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_3,
            imageRes = R.drawable.ci,
            description = R.string.description_3,
        ),
        Wellness(
            summary = R.string.summary_4,
            imageRes = R.drawable.di,
            description = R.string.description_4,
        ),
        Wellness(
            summary = R.string.summary_5,
            imageRes = R.drawable.ei,
            description = R.string.description_5,
        ),
        Wellness(
            summary = R.string.summary_6,
            imageRes = R.drawable.ai,
            description = R.string.description_6,
        ),
        Wellness(
            summary = R.string.summary_7,
            imageRes = R.drawable.bi,
            description = R.string.description_7,
        ),
        Wellness(
            summary = R.string.summary_8,
            imageRes = R.drawable.ci,
            description = R.string.description_8,
        ),
        Wellness(
            summary = R.string.summary_9,
            imageRes = R.drawable.di,
            description = R.string.description_9,
        ),
        Wellness(
            summary = R.string.summary_10,
            imageRes = R.drawable.ei,
            description = R.string.description_10,
        ),
        Wellness(
            summary = R.string.summary_11,
            imageRes = R.drawable.ai,
            description = R.string.description_11,
        ),
        Wellness(
            summary = R.string.summary_12,
            imageRes = R.drawable.bi,
            description = R.string.description_12,
        ),
        Wellness(
            summary = R.string.summary_13,
            imageRes = R.drawable.ci,
            description = R.string.description_13,
        ),
        Wellness(
            summary = R.string.summary_14,
            imageRes = R.drawable.di,
            description = R.string.description_14,
            ),
        Wellness(
            summary = R.string.summary_15,
            imageRes = R.drawable.ei,
            description = R.string.description_15,
        ),

        Wellness(
            summary = R.string.summary_16,
            imageRes = R.drawable.ai,
            description = R.string.description_16,
        ),
        Wellness(
            summary = R.string.summary_17,
            imageRes = R.drawable.bi,
            description = R.string.description_17,
        ),
        Wellness(
            summary = R.string.summary_18,
            imageRes = R.drawable.ci,
            description = R.string.description_18,
        ),
        Wellness(
            summary = R.string.summary_19,
            imageRes = R.drawable.di,
            description = R.string.description_19,
        ),
        Wellness(
            summary = R.string.summary_20,
            imageRes = R.drawable.ei,
            description = R.string.description_20,
        ),
        Wellness(
            summary = R.string.summary_21,
            imageRes = R.drawable.ai,
            description = R.string.description_21,
        ),
        Wellness(
            summary = R.string.summary_22,
            imageRes = R.drawable.bi,
            description = R.string.description_22,
        ),
        Wellness(
            summary = R.string.summary_23,
            imageRes = R.drawable.ci,
            description = R.string.description_23,
        ),
        Wellness(
            summary = R.string.summary_24,
            imageRes = R.drawable.di,
            description = R.string.description_24,
        ),
        Wellness(
            summary = R.string.summary_25,
            imageRes = R.drawable.ei,
            description = R.string.description_25,
        ),
        Wellness(
            summary = R.string.summary_26,
            imageRes = R.drawable.ai,
            description = R.string.description_26,
        ),
        Wellness(
            summary = R.string.summary_27,
            imageRes = R.drawable.bi,
            description = R.string.description_27,
        ),
        Wellness(
            summary = R.string.summary_28,
            imageRes = R.drawable.ci,
            description = R.string.description_28,
        ),
        Wellness(
            summary = R.string.summary_29,
            imageRes = R.drawable.di,
            description = R.string.description_29,
        ),
        Wellness(
            summary = R.string.summary_30,
            imageRes = R.drawable.ei,
            description = R.string.description_30,
        ),

    ).mapIndexed { index, wellness -> wellness.copy(day = index + 1) }
}