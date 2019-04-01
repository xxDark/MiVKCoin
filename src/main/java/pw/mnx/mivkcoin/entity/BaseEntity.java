

/*
 * Developed by MicroNovaX (Mikhail) on 30.03.19 4:17.
 * Copyright (c) 2019. All rights reserved.
 */

package pw.mnx.mivkcoin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @Version
    @Column(name = "version")
    @JsonIgnore
    private Long version;

}

