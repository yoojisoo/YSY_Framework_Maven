<template>
  <div>
    <v-container
      v-for="align in alignments"
      :key="align"
      class="lighten-5 mb-6"
      style="background-color: lightgrey;"
    >
      <v-row
        :align="align"
        no-gutters
        style="height: 150px;"
      >
        <v-col
          v-for="n in 3"
          :key="n"
        >
          <v-card
            class="pa-2"
            outlined
            tile
          >
            One of three columns
          </v-card>
        </v-col>
      </v-row>
    </v-container>

    <v-container class="lighten-5 mb-6" style="background-color: lightgrey;">
      <v-row no-gutters style="height: 150px;">
        <v-col
          v-for="align in alignments"
          :key="align"
          :align-self="align"
        >
          <v-card
            class="pa-2"
            outlined
            tile
          >
            One of three columns
          </v-card>
        </v-col>
      </v-row>
    </v-container>

     <v-container class="lighten-5 mb-6" style="background-color: lightgrey;">
        <v-row no-gutters style="height: 300px;">
          <v-col
            clos="12"
            sm="6"
            md="8"
            align-self="center"
          >
            <v-card
              class="pa-5"
              outlined
              tile
              color="#385F73"
            >
              <v-card-title class="text-h4">
                .col-12 .col-sm-6 .col-md-8
              </v-card-title>

              <v-card-subtitle class="text-h6">Card Subtitle</v-card-subtitle>

              <v-card-actions>
                <v-btn text>Listen Now</v-btn>
              </v-card-actions>
            </v-card>
          </v-col>
          <v-col
            cols="6"
            md="4"
          >
            <v-card
              class="pa-2"
              outlined
              tile
            >
              .col-6 .col-md-4
            </v-card>
          </v-col>
        </v-row>
      </v-container>
  </div>
</template>

<script>
export default {
  data: () => ({
    alignments: [
      'start',
      'center',
      'end'
    ]
  })
}
</script>