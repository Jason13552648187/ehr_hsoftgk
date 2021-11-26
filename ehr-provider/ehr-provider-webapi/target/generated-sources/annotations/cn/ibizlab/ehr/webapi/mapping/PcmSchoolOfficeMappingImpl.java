package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmSchoolOffice;
import cn.ibizlab.ehr.webapi.dto.PcmSchoolOfficeDTO;
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
public class PcmSchoolOfficeMappingImpl implements PcmSchoolOfficeMapping {

    @Override
    public PcmSchoolOffice toDomain(PcmSchoolOfficeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmSchoolOffice pcmSchoolOffice = new PcmSchoolOffice();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmSchoolOffice.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmSchoolOffice.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPcmschoolofficename() != null ) {
            pcmSchoolOffice.setPcmschoolofficename( dto.getPcmschoolofficename() );
        }
        if ( dto.getCadrename() != null ) {
            pcmSchoolOffice.setCadrename( dto.getCadrename() );
        }
        if ( dto.getCadreenddatetime() != null ) {
            pcmSchoolOffice.setCadreenddatetime( dto.getCadreenddatetime() );
        }
        if ( dto.getBbsj() != null ) {
            pcmSchoolOffice.setBbsj( dto.getBbsj() );
        }
        if ( dto.getFlag() != null ) {
            pcmSchoolOffice.setFlag( dto.getFlag() );
        }
        if ( dto.getCadrestartdatetime() != null ) {
            pcmSchoolOffice.setCadrestartdatetime( dto.getCadrestartdatetime() );
        }
        if ( dto.getCadredescription() != null ) {
            pcmSchoolOffice.setCadredescription( dto.getCadredescription() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmSchoolOffice.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmSchoolOffice.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmSchoolOffice.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmschoolofficeid() != null ) {
            pcmSchoolOffice.setPcmschoolofficeid( dto.getPcmschoolofficeid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmSchoolOffice.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmSchoolOffice.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmSchoolOffice.setPcmprofilename( dto.getPcmprofilename() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmSchoolOffice.setCertificatenumber( dto.getCertificatenumber() );
        }

        return pcmSchoolOffice;
    }

    @Override
    public PcmSchoolOfficeDTO toDto(PcmSchoolOffice entity) {
        if ( entity == null ) {
            return null;
        }

        PcmSchoolOfficeDTO pcmSchoolOfficeDTO = new PcmSchoolOfficeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmSchoolOfficeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmSchoolOfficeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPcmschoolofficename() != null ) {
            pcmSchoolOfficeDTO.setPcmschoolofficename( entity.getPcmschoolofficename() );
        }
        if ( entity.getCadrename() != null ) {
            pcmSchoolOfficeDTO.setCadrename( entity.getCadrename() );
        }
        if ( entity.getCadreenddatetime() != null ) {
            pcmSchoolOfficeDTO.setCadreenddatetime( entity.getCadreenddatetime() );
        }
        if ( entity.getBbsj() != null ) {
            pcmSchoolOfficeDTO.setBbsj( entity.getBbsj() );
        }
        if ( entity.getFlag() != null ) {
            pcmSchoolOfficeDTO.setFlag( entity.getFlag() );
        }
        if ( entity.getCadrestartdatetime() != null ) {
            pcmSchoolOfficeDTO.setCadrestartdatetime( entity.getCadrestartdatetime() );
        }
        if ( entity.getCadredescription() != null ) {
            pcmSchoolOfficeDTO.setCadredescription( entity.getCadredescription() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmSchoolOfficeDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmSchoolOfficeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmSchoolOfficeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmschoolofficeid() != null ) {
            pcmSchoolOfficeDTO.setPcmschoolofficeid( entity.getPcmschoolofficeid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmSchoolOfficeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmSchoolOfficeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmSchoolOfficeDTO.setPcmprofilename( entity.getPcmprofilename() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmSchoolOfficeDTO.setCertificatenumber( entity.getCertificatenumber() );
        }

        return pcmSchoolOfficeDTO;
    }

    @Override
    public List<PcmSchoolOffice> toDomain(List<PcmSchoolOfficeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmSchoolOffice> list = new ArrayList<PcmSchoolOffice>( dtoList.size() );
        for ( PcmSchoolOfficeDTO pcmSchoolOfficeDTO : dtoList ) {
            list.add( toDomain( pcmSchoolOfficeDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmSchoolOfficeDTO> toDto(List<PcmSchoolOffice> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmSchoolOfficeDTO> list = new ArrayList<PcmSchoolOfficeDTO>( entityList.size() );
        for ( PcmSchoolOffice pcmSchoolOffice : entityList ) {
            list.add( toDto( pcmSchoolOffice ) );
        }

        return list;
    }
}
