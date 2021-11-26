package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimArchivesManage;
import cn.ibizlab.ehr.webapi.dto.PimArchivesManageDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimArchivesManageMappingImpl implements PimArchivesManageMapping {

    @Override
    public PimArchivesManage toDomain(PimArchivesManageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimArchivesManage pimArchivesManage = new PimArchivesManage();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimArchivesManage.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimArchivesManage.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getArchivesmanagename() != null ) {
            pimArchivesManage.setArchivesmanagename( dto.getArchivesmanagename() );
        }
        if ( dto.getArchivesno() != null ) {
            pimArchivesManage.setArchivesno( dto.getArchivesno() );
        }
        if ( dto.getEnable() != null ) {
            pimArchivesManage.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            pimArchivesManage.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimArchivesManage.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimArchivesManage.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimArchivesManage.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getArchivesmanageid() != null ) {
            pimArchivesManage.setArchivesmanageid( dto.getArchivesmanageid() );
        }

        return pimArchivesManage;
    }

    @Override
    public PimArchivesManageDTO toDto(PimArchivesManage entity) {
        if ( entity == null ) {
            return null;
        }

        PimArchivesManageDTO pimArchivesManageDTO = new PimArchivesManageDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimArchivesManageDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimArchivesManageDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getArchivesmanagename() != null ) {
            pimArchivesManageDTO.setArchivesmanagename( entity.getArchivesmanagename() );
        }
        if ( entity.getArchivesno() != null ) {
            pimArchivesManageDTO.setArchivesno( entity.getArchivesno() );
        }
        if ( entity.getEnable() != null ) {
            pimArchivesManageDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            pimArchivesManageDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimArchivesManageDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimArchivesManageDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimArchivesManageDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getArchivesmanageid() != null ) {
            pimArchivesManageDTO.setArchivesmanageid( entity.getArchivesmanageid() );
        }

        return pimArchivesManageDTO;
    }

    @Override
    public List<PimArchivesManage> toDomain(List<PimArchivesManageDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimArchivesManage> list = new ArrayList<PimArchivesManage>( dtoList.size() );
        for ( PimArchivesManageDTO pimArchivesManageDTO : dtoList ) {
            list.add( toDomain( pimArchivesManageDTO ) );
        }

        return list;
    }

    @Override
    public List<PimArchivesManageDTO> toDto(List<PimArchivesManage> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimArchivesManageDTO> list = new ArrayList<PimArchivesManageDTO>( entityList.size() );
        for ( PimArchivesManage pimArchivesManage : entityList ) {
            list.add( toDto( pimArchivesManage ) );
        }

        return list;
    }
}
