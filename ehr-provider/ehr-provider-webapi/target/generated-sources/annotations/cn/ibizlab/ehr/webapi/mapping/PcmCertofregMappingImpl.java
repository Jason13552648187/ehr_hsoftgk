package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmCertofreg;
import cn.ibizlab.ehr.webapi.dto.PcmCertofregDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmCertofregMappingImpl implements PcmCertofregMapping {

    @Override
    public PcmCertofreg toDomain(PcmCertofregDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmCertofreg pcmCertofreg = new PcmCertofreg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmCertofreg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmCertofreg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLx() != null ) {
            pcmCertofreg.setLx( dto.getLx() );
        }
        if ( dto.getPcmcertofregname() != null ) {
            pcmCertofreg.setPcmcertofregname( dto.getPcmcertofregname() );
        }
        if ( dto.getBh() != null ) {
            pcmCertofreg.setBh( dto.getBh() );
        }
        if ( dto.getZsfj() != null ) {
            pcmCertofreg.setZsfj( dto.getZsfj() );
        }
        if ( dto.getPimqualmajorid() != null ) {
            pcmCertofreg.setPimqualmajorid( dto.getPimqualmajorid() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmCertofreg.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmCertofreg.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmCertofreg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmCertofreg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pcmCertofreg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmcertofregid() != null ) {
            pcmCertofreg.setPcmcertofregid( dto.getPcmcertofregid() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmCertofreg.setCertificatenumber( dto.getCertificatenumber() );
        }
        if ( dto.getZyzgzy() != null ) {
            pcmCertofreg.setZyzgzy( dto.getZyzgzy() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmCertofreg.setPcmprofilename( dto.getPcmprofilename() );
        }

        return pcmCertofreg;
    }

    @Override
    public PcmCertofregDTO toDto(PcmCertofreg entity) {
        if ( entity == null ) {
            return null;
        }

        PcmCertofregDTO pcmCertofregDTO = new PcmCertofregDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmCertofregDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmCertofregDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLx() != null ) {
            pcmCertofregDTO.setLx( entity.getLx() );
        }
        if ( entity.getPcmcertofregname() != null ) {
            pcmCertofregDTO.setPcmcertofregname( entity.getPcmcertofregname() );
        }
        if ( entity.getBh() != null ) {
            pcmCertofregDTO.setBh( entity.getBh() );
        }
        if ( entity.getZsfj() != null ) {
            pcmCertofregDTO.setZsfj( entity.getZsfj() );
        }
        if ( entity.getPimqualmajorid() != null ) {
            pcmCertofregDTO.setPimqualmajorid( entity.getPimqualmajorid() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmCertofregDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmCertofregDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmCertofregDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmCertofregDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pcmCertofregDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmcertofregid() != null ) {
            pcmCertofregDTO.setPcmcertofregid( entity.getPcmcertofregid() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmCertofregDTO.setCertificatenumber( entity.getCertificatenumber() );
        }
        if ( entity.getZyzgzy() != null ) {
            pcmCertofregDTO.setZyzgzy( entity.getZyzgzy() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmCertofregDTO.setPcmprofilename( entity.getPcmprofilename() );
        }

        return pcmCertofregDTO;
    }

    @Override
    public List<PcmCertofreg> toDomain(List<PcmCertofregDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmCertofreg> list = new ArrayList<PcmCertofreg>( dtoList.size() );
        for ( PcmCertofregDTO pcmCertofregDTO : dtoList ) {
            list.add( toDomain( pcmCertofregDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmCertofregDTO> toDto(List<PcmCertofreg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmCertofregDTO> list = new ArrayList<PcmCertofregDTO>( entityList.size() );
        for ( PcmCertofreg pcmCertofreg : entityList ) {
            list.add( toDto( pcmCertofreg ) );
        }

        return list;
    }
}
