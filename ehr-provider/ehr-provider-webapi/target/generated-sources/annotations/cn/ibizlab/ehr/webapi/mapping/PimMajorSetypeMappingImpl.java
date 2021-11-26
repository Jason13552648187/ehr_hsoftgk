package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimMajorSetype;
import cn.ibizlab.ehr.webapi.dto.PimMajorSetypeDTO;
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
public class PimMajorSetypeMappingImpl implements PimMajorSetypeMapping {

    @Override
    public PimMajorSetype toDomain(PimMajorSetypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimMajorSetype pimMajorSetype = new PimMajorSetype();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimMajorSetype.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimMajorSetype.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSerialno() != null ) {
            pimMajorSetype.setSerialno( dto.getSerialno() );
        }
        if ( dto.getPimmajorsetypename() != null ) {
            pimMajorSetype.setPimmajorsetypename( dto.getPimmajorsetypename() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimMajorSetype.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimmajorsetypeid() != null ) {
            pimMajorSetype.setPimmajorsetypeid( dto.getPimmajorsetypeid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimMajorSetype.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimMajorSetype.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimMajorSetype.setCreateman( dto.getCreateman() );
        }

        return pimMajorSetype;
    }

    @Override
    public PimMajorSetypeDTO toDto(PimMajorSetype entity) {
        if ( entity == null ) {
            return null;
        }

        PimMajorSetypeDTO pimMajorSetypeDTO = new PimMajorSetypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimMajorSetypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimMajorSetypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSerialno() != null ) {
            pimMajorSetypeDTO.setSerialno( entity.getSerialno() );
        }
        if ( entity.getPimmajorsetypename() != null ) {
            pimMajorSetypeDTO.setPimmajorsetypename( entity.getPimmajorsetypename() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimMajorSetypeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimmajorsetypeid() != null ) {
            pimMajorSetypeDTO.setPimmajorsetypeid( entity.getPimmajorsetypeid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimMajorSetypeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimMajorSetypeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimMajorSetypeDTO.setCreateman( entity.getCreateman() );
        }

        return pimMajorSetypeDTO;
    }

    @Override
    public List<PimMajorSetype> toDomain(List<PimMajorSetypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimMajorSetype> list = new ArrayList<PimMajorSetype>( dtoList.size() );
        for ( PimMajorSetypeDTO pimMajorSetypeDTO : dtoList ) {
            list.add( toDomain( pimMajorSetypeDTO ) );
        }

        return list;
    }

    @Override
    public List<PimMajorSetypeDTO> toDto(List<PimMajorSetype> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimMajorSetypeDTO> list = new ArrayList<PimMajorSetypeDTO>( entityList.size() );
        for ( PimMajorSetype pimMajorSetype : entityList ) {
            list.add( toDto( pimMajorSetype ) );
        }

        return list;
    }
}
