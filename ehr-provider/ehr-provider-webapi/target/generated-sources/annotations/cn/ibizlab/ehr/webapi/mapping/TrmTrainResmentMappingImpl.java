package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainResment;
import cn.ibizlab.ehr.webapi.dto.TrmTrainResmentDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainResmentMappingImpl implements TrmTrainResmentMapping {

    @Override
    public TrmTrainResment toDomain(TrmTrainResmentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainResment trmTrainResment = new TrmTrainResment();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainResment.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainResment.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDcwjtm() != null ) {
            trmTrainResment.setDcwjtm( dto.getDcwjtm() );
        }
        if ( dto.getBz() != null ) {
            trmTrainResment.setBz( dto.getBz() );
        }
        if ( dto.getPgjg() != null ) {
            trmTrainResment.setPgjg( dto.getPgjg() );
        }
        if ( dto.getTrmtrainresmentname() != null ) {
            trmTrainResment.setTrmtrainresmentname( dto.getTrmtrainresmentname() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainResment.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainResment.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainResment.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainResment.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainResment.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmtrainresmentid() != null ) {
            trmTrainResment.setTrmtrainresmentid( dto.getTrmtrainresmentid() );
        }

        return trmTrainResment;
    }

    @Override
    public TrmTrainResmentDTO toDto(TrmTrainResment entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainResmentDTO trmTrainResmentDTO = new TrmTrainResmentDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainResmentDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainResmentDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDcwjtm() != null ) {
            trmTrainResmentDTO.setDcwjtm( entity.getDcwjtm() );
        }
        if ( entity.getBz() != null ) {
            trmTrainResmentDTO.setBz( entity.getBz() );
        }
        if ( entity.getPgjg() != null ) {
            trmTrainResmentDTO.setPgjg( entity.getPgjg() );
        }
        if ( entity.getTrmtrainresmentname() != null ) {
            trmTrainResmentDTO.setTrmtrainresmentname( entity.getTrmtrainresmentname() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainResmentDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainResmentDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainResmentDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainResmentDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainResmentDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmtrainresmentid() != null ) {
            trmTrainResmentDTO.setTrmtrainresmentid( entity.getTrmtrainresmentid() );
        }

        return trmTrainResmentDTO;
    }

    @Override
    public List<TrmTrainResment> toDomain(List<TrmTrainResmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainResment> list = new ArrayList<TrmTrainResment>( dtoList.size() );
        for ( TrmTrainResmentDTO trmTrainResmentDTO : dtoList ) {
            list.add( toDomain( trmTrainResmentDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainResmentDTO> toDto(List<TrmTrainResment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainResmentDTO> list = new ArrayList<TrmTrainResmentDTO>( entityList.size() );
        for ( TrmTrainResment trmTrainResment : entityList ) {
            list.add( toDto( trmTrainResment ) );
        }

        return list;
    }
}
