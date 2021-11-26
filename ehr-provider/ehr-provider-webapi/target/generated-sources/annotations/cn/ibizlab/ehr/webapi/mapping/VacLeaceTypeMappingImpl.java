package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacLeaceType;
import cn.ibizlab.ehr.webapi.dto.VacLeaceTypeDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacLeaceTypeMappingImpl implements VacLeaceTypeMapping {

    @Override
    public VacLeaceType toDomain(VacLeaceTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacLeaceType vacLeaceType = new VacLeaceType();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacLeaceType.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacLeaceType.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTypecode() != null ) {
            vacLeaceType.setTypecode( dto.getTypecode() );
        }
        if ( dto.getVacleacetypename() != null ) {
            vacLeaceType.setVacleacetypename( dto.getVacleacetypename() );
        }
        if ( dto.getEnable() != null ) {
            vacLeaceType.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            vacLeaceType.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            vacLeaceType.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getVacleacetypeid() != null ) {
            vacLeaceType.setVacleacetypeid( dto.getVacleacetypeid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacLeaceType.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            vacLeaceType.setUpdateman( dto.getUpdateman() );
        }

        return vacLeaceType;
    }

    @Override
    public VacLeaceTypeDTO toDto(VacLeaceType entity) {
        if ( entity == null ) {
            return null;
        }

        VacLeaceTypeDTO vacLeaceTypeDTO = new VacLeaceTypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacLeaceTypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacLeaceTypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTypecode() != null ) {
            vacLeaceTypeDTO.setTypecode( entity.getTypecode() );
        }
        if ( entity.getVacleacetypename() != null ) {
            vacLeaceTypeDTO.setVacleacetypename( entity.getVacleacetypename() );
        }
        if ( entity.getEnable() != null ) {
            vacLeaceTypeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            vacLeaceTypeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            vacLeaceTypeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getVacleacetypeid() != null ) {
            vacLeaceTypeDTO.setVacleacetypeid( entity.getVacleacetypeid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacLeaceTypeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            vacLeaceTypeDTO.setUpdateman( entity.getUpdateman() );
        }

        return vacLeaceTypeDTO;
    }

    @Override
    public List<VacLeaceType> toDomain(List<VacLeaceTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacLeaceType> list = new ArrayList<VacLeaceType>( dtoList.size() );
        for ( VacLeaceTypeDTO vacLeaceTypeDTO : dtoList ) {
            list.add( toDomain( vacLeaceTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<VacLeaceTypeDTO> toDto(List<VacLeaceType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacLeaceTypeDTO> list = new ArrayList<VacLeaceTypeDTO>( entityList.size() );
        for ( VacLeaceType vacLeaceType : entityList ) {
            list.add( toDto( vacLeaceType ) );
        }

        return list;
    }
}
