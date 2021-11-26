package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimFilebatvhupload;
import cn.ibizlab.ehr.webapi.dto.PimFilebatvhuploadDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimFilebatvhuploadMappingImpl implements PimFilebatvhuploadMapping {

    @Override
    public PimFilebatvhupload toDomain(PimFilebatvhuploadDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimFilebatvhupload pimFilebatvhupload = new PimFilebatvhupload();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimFilebatvhupload.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimFilebatvhupload.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimfilebatvhuploadname() != null ) {
            pimFilebatvhupload.setPimfilebatvhuploadname( dto.getPimfilebatvhuploadname() );
        }
        if ( dto.getFiles() != null ) {
            pimFilebatvhupload.setFiles( dto.getFiles() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimFilebatvhupload.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pimFilebatvhupload.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimFilebatvhupload.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimfilebatvhuploadid() != null ) {
            pimFilebatvhupload.setPimfilebatvhuploadid( dto.getPimfilebatvhuploadid() );
        }
        if ( dto.getCreateman() != null ) {
            pimFilebatvhupload.setCreateman( dto.getCreateman() );
        }

        return pimFilebatvhupload;
    }

    @Override
    public PimFilebatvhuploadDTO toDto(PimFilebatvhupload entity) {
        if ( entity == null ) {
            return null;
        }

        PimFilebatvhuploadDTO pimFilebatvhuploadDTO = new PimFilebatvhuploadDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimFilebatvhuploadDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimFilebatvhuploadDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimfilebatvhuploadname() != null ) {
            pimFilebatvhuploadDTO.setPimfilebatvhuploadname( entity.getPimfilebatvhuploadname() );
        }
        if ( entity.getFiles() != null ) {
            pimFilebatvhuploadDTO.setFiles( entity.getFiles() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimFilebatvhuploadDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pimFilebatvhuploadDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimFilebatvhuploadDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimfilebatvhuploadid() != null ) {
            pimFilebatvhuploadDTO.setPimfilebatvhuploadid( entity.getPimfilebatvhuploadid() );
        }
        if ( entity.getCreateman() != null ) {
            pimFilebatvhuploadDTO.setCreateman( entity.getCreateman() );
        }

        return pimFilebatvhuploadDTO;
    }

    @Override
    public List<PimFilebatvhupload> toDomain(List<PimFilebatvhuploadDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimFilebatvhupload> list = new ArrayList<PimFilebatvhupload>( dtoList.size() );
        for ( PimFilebatvhuploadDTO pimFilebatvhuploadDTO : dtoList ) {
            list.add( toDomain( pimFilebatvhuploadDTO ) );
        }

        return list;
    }

    @Override
    public List<PimFilebatvhuploadDTO> toDto(List<PimFilebatvhupload> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimFilebatvhuploadDTO> list = new ArrayList<PimFilebatvhuploadDTO>( entityList.size() );
        for ( PimFilebatvhupload pimFilebatvhupload : entityList ) {
            list.add( toDto( pimFilebatvhupload ) );
        }

        return list;
    }
}
