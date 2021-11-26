package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainFacies;
import cn.ibizlab.ehr.webapi.dto.TrmTrainFaciesDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainFaciesMappingImpl implements TrmTrainFaciesMapping {

    @Override
    public TrmTrainFacies toDomain(TrmTrainFaciesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainFacies trmTrainFacies = new TrmTrainFacies();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainFacies.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainFacies.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDd() != null ) {
            trmTrainFacies.setDd( dto.getDd() );
        }
        if ( dto.getSb() != null ) {
            trmTrainFacies.setSb( dto.getSb() );
        }
        if ( dto.getSffc() != null ) {
            trmTrainFacies.setSffc( dto.getSffc() );
        }
        if ( dto.getYysb() != null ) {
            trmTrainFacies.setYysb( dto.getYysb() );
        }
        if ( dto.getSslb() != null ) {
            trmTrainFacies.setSslb( dto.getSslb() );
        }
        if ( dto.getBgsb() != null ) {
            trmTrainFacies.setBgsb( dto.getBgsb() );
        }
        if ( dto.getDgsb() != null ) {
            trmTrainFacies.setDgsb( dto.getDgsb() );
        }
        if ( dto.getTrmtrainfaciesname() != null ) {
            trmTrainFacies.setTrmtrainfaciesname( dto.getTrmtrainfaciesname() );
        }
        if ( dto.getSsbm() != null ) {
            trmTrainFacies.setSsbm( dto.getSsbm() );
        }
        if ( dto.getSfgx() != null ) {
            trmTrainFacies.setSfgx( dto.getSfgx() );
        }
        if ( dto.getSssl() != null ) {
            trmTrainFacies.setSssl( dto.getSssl() );
        }
        if ( dto.getSszp() != null ) {
            trmTrainFacies.setSszp( dto.getSszp() );
        }
        if ( dto.getTrmtrainaddressid() != null ) {
            trmTrainFacies.setTrmtrainaddressid( dto.getTrmtrainaddressid() );
        }
        if ( dto.getTrmtrainfaciesid() != null ) {
            trmTrainFacies.setTrmtrainfaciesid( dto.getTrmtrainfaciesid() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainFacies.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainFacies.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainFacies.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainFacies.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainFacies.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getTrmtrainaddressname() != null ) {
            trmTrainFacies.setTrmtrainaddressname( dto.getTrmtrainaddressname() );
        }

        return trmTrainFacies;
    }

    @Override
    public TrmTrainFaciesDTO toDto(TrmTrainFacies entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainFaciesDTO trmTrainFaciesDTO = new TrmTrainFaciesDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainFaciesDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainFaciesDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDd() != null ) {
            trmTrainFaciesDTO.setDd( entity.getDd() );
        }
        if ( entity.getSb() != null ) {
            trmTrainFaciesDTO.setSb( entity.getSb() );
        }
        if ( entity.getSffc() != null ) {
            trmTrainFaciesDTO.setSffc( entity.getSffc() );
        }
        if ( entity.getYysb() != null ) {
            trmTrainFaciesDTO.setYysb( entity.getYysb() );
        }
        if ( entity.getSslb() != null ) {
            trmTrainFaciesDTO.setSslb( entity.getSslb() );
        }
        if ( entity.getBgsb() != null ) {
            trmTrainFaciesDTO.setBgsb( entity.getBgsb() );
        }
        if ( entity.getDgsb() != null ) {
            trmTrainFaciesDTO.setDgsb( entity.getDgsb() );
        }
        if ( entity.getTrmtrainfaciesname() != null ) {
            trmTrainFaciesDTO.setTrmtrainfaciesname( entity.getTrmtrainfaciesname() );
        }
        if ( entity.getSsbm() != null ) {
            trmTrainFaciesDTO.setSsbm( entity.getSsbm() );
        }
        if ( entity.getSfgx() != null ) {
            trmTrainFaciesDTO.setSfgx( entity.getSfgx() );
        }
        if ( entity.getSssl() != null ) {
            trmTrainFaciesDTO.setSssl( entity.getSssl() );
        }
        if ( entity.getSszp() != null ) {
            trmTrainFaciesDTO.setSszp( entity.getSszp() );
        }
        if ( entity.getTrmtrainaddressid() != null ) {
            trmTrainFaciesDTO.setTrmtrainaddressid( entity.getTrmtrainaddressid() );
        }
        if ( entity.getTrmtrainfaciesid() != null ) {
            trmTrainFaciesDTO.setTrmtrainfaciesid( entity.getTrmtrainfaciesid() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainFaciesDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainFaciesDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainFaciesDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainFaciesDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainFaciesDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getTrmtrainaddressname() != null ) {
            trmTrainFaciesDTO.setTrmtrainaddressname( entity.getTrmtrainaddressname() );
        }

        return trmTrainFaciesDTO;
    }

    @Override
    public List<TrmTrainFacies> toDomain(List<TrmTrainFaciesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainFacies> list = new ArrayList<TrmTrainFacies>( dtoList.size() );
        for ( TrmTrainFaciesDTO trmTrainFaciesDTO : dtoList ) {
            list.add( toDomain( trmTrainFaciesDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainFaciesDTO> toDto(List<TrmTrainFacies> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainFaciesDTO> list = new ArrayList<TrmTrainFaciesDTO>( entityList.size() );
        for ( TrmTrainFacies trmTrainFacies : entityList ) {
            list.add( toDto( trmTrainFacies ) );
        }

        return list;
    }
}
